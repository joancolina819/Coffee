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

public class OperationsResource {

	private Operations instance;
	private String id;
	private ResourceSaver resourceSaver;

	public OperationsResource(Operations instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public Operations getOperations() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateOperations(OperationsImpl operations) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), operations);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteOperations() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("op/{id}")
	public OperationResource getResourceOp(@PathParam("id") String id) {
		return new OperationResource(webmapi.service.IdentificationResolver.findOperationById(instance.getOp(), id), id, resourceSaver);
	}

	// REF op

	@GET
	@Path("op")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getOp(@QueryParam("index") @DefaultValue("-1") int index) {
		if (index == -1) {
			Wrapper<Operation> entity = new Wrapper<Operation>(instance.getOp());
			return Response.ok(entity).build();
		} else
			return Response.ok(instance.getOp().get(index)).build();
	}

	@POST
	@Path("op")
	public void addOp(OperationImpl op, @DefaultValue("0") @QueryParam("index") int index) {
		instance.getOp().add(op);
		resourceSaver.save();
	}

}
