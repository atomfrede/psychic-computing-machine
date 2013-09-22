package de.atomfrede.bookshelf.application.wicket;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.springframework.stereotype.Component;


@Component(value = "wicketApplication")
public class WicketApplication extends WebApplication{

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return null;
	}
	
}