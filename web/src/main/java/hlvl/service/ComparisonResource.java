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

public class ComparisonResource {

	private Comparison instance;
	private String id;
	private ResourceSaver resourceSaver;

	public ComparisonResource(Comparison instance, String id, ResourceSaver r) {
		this.instance = instance;
		this.id = id;
		resourceSaver = r;
	}

	@PermitAll
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public Comparison getComparison() {
		return instance;
	}

	@PermitAll
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void updateComparison(ComparisonImpl comparison) {
		resourceSaver.put(EcoreUtil.getIdentification(instance), comparison);
	}

	@PermitAll
	@DELETE
	@Mapped(namespaceMap = { @XmlNsMap(namespace = "http://emf-rest.com/proxy", jsonName = "proxy") })
	public void deleteComparison() {
		resourceSaver.remove(EcoreUtil.getIdentification(instance));
	}

	@Path("left")
	public RelationalResource getResourceLeft() {
		return new RelationalResource(instance.getLeft(), id, resourceSaver);
	}

	@Path("right")
	public RelationalResource getResourceRight() {
		return new RelationalResource(instance.getRight(), id, resourceSaver);
	}

}
