package ch.bebaforst.bebaweb;

import ch.bebaforst.bebaweb.UI.Login;
import ch.bebaforst.bebaweb.UI.ModuleSelect;
import ch.bebaforst.bebaweb.UI.StdRapport;


import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

/**
 * Main UI class
 */
@SuppressWarnings("serial")
public class BebawebUI extends UI {

	Navigator navigator;
	
	
	@Override
	protected void init(VaadinRequest request) {
		getPage().setTitle("Bebaforst");
	      
	    navigator = new Navigator(this, this);
	      
	    navigator.addView("login", new Login(navigator));
	    navigator.addView("main", new ModuleSelect(navigator));
	    navigator.addView("stdRapp", new StdRapport(navigator));
	    navigator.navigateTo("login");
	    
	}

}