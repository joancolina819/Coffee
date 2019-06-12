package webmapi.service.configuration;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import hlvl.impl.ModelImpl;

@XmlRootElement(name ="list")
@XmlSeeAlso(ModelImpl.class)
public class Wrapper<T> {

	private List<T> items;

	public Wrapper() {
		items = new ArrayList<T>();
	}

	
	public Wrapper(List<T> items) {
		this.items = items;
	}

	@XmlAnyElement(lax = true)
	public List<T> getItems() {
		return items;
	}

}