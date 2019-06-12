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

public class HierarchyResource {

	private Hierarchy instance;
	private String id;
	private ResourceSaver resourceSaver;

	public HierarchyResource(Hierarchy instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public Hierarchy getHierarchy() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateHierarchy(HierarchyImpl hierarchy) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), hierarchy);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteHierarchy() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("parent")
	public ElmDeclarationResource getResourceParent() {
		return new ElmDeclarationResource(instance.getParent(), id, resourceSaver);
	}

	@Path("children")
	public ListOfIDsResource getResourceChildren() {
		return new ListOfIDsResource(instance.getChildren(), id, resourceSaver);
	}

}
