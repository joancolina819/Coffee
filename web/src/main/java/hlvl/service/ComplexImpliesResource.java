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

public class ComplexImpliesResource {

	private ComplexImplies instance;
	private String id;
	private ResourceSaver resourceSaver;

	public ComplexImpliesResource(ComplexImplies instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public ComplexImplies getComplexImplies() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateComplexImplies(ComplexImpliesImpl complexImplies) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), complexImplies);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteComplexImplies() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("exp")
	public ExpressionResource getResourceExp() {
		return new ExpressionResource(instance.getExp(), id, resourceSaver);
	}

	@Path("elements")
	public ListOfIDsResource getResourceElements() {
		return new ListOfIDsResource(instance.getElements(), id, resourceSaver);
	}

}
