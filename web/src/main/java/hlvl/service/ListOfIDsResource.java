package hlvl.service;

import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.eclipse.emf.ecore.util.EcoreUtil;
import javax.ws.rs.core.Response;
import webmapi.service.configuration.Wrapper;
import webmapi.util.ResourceSaver;
import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;
import javax.annotation.security.RolesAllowed;
import javax.annotation.security.PermitAll;

import hlvl.*;
import hlvl.impl.*;

public class ListOfIDsResource {

	private ListOfIDs instance;
	private String id;
	private ResourceSaver resourceSaver;

	public ListOfIDsResource(ListOfIDs instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public ListOfIDs getListOfIDs() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateListOfIDs(ListOfIDsImpl listOfIDs) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), listOfIDs);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteListOfIDs() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("values/{id}")
	public ElmDeclarationResource getResourceValues(@PathParam("id") String id) {
		return new ElmDeclarationResource(webmapi.service.IdentificationResolver.findElmDeclarationById(instance.getValues(), id), id, resourceSaver);
	}

	// REF values

	@GET
	@Path("values")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getValues(@QueryParam("index") @DefaultValue("-1") int index) {
		if (index == -1) {
			Wrapper<ElmDeclaration> entity = new Wrapper<ElmDeclaration>(instance.getValues());
			return Response.ok(entity).build();
		} else
			return Response.ok(instance.getValues().get(index)).build();
	}

}
