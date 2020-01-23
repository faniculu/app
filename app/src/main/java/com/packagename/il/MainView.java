package com.packagename.il;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;



/**
 * The main view contains a button and a click listener.
 */
@PageTitle("innovationlegacy")
@Route("home")
public class MainView extends HorizontalLayout {
	
	
	private static final long serialVersionUID = 1L;
	public MainView() {
		
		
	    
	    setWidthFull();
		setHeight("200%");
	    setAlignItems(Alignment.CENTER);
        getStyle().set("background", "#FFFFFF");
        
        	
     	
    	  Label companyname = new Label("WEBSITES . MOBILE APPS .WEB BASED APPS . DESKTOP APPS ");
     	  companyname.getStyle().set("color", "black");
     	  companyname.getStyle().set("font-size", "1.1em");
     	  companyname.getStyle().set("position", "absolute");
     	  companyname.getStyle().set("top", "25%");
     	  companyname.getStyle().set("left", "35%");
     	  companyname.getStyle().set("font-weight", "bold");
     	  add(companyname);
     
	        
     	
     	
     	////////////////buttons/////////////////////
	      
     	 Button homebtn = new Button("Home", new Icon(VaadinIcon.HOME));
         homebtn.getStyle().set("color", "black");
         homebtn.getStyle().set("position", "absolute");
         homebtn.getStyle().set("left", "60%");
         homebtn.getStyle().set("border-radius", "20px");
      	
         homebtn.getStyle().set("top", "4%");
         add(homebtn);
         homebtn.addClickListener( event -> this.getUI().get().navigate("home"));
         
         Button aboutbtn = new Button("About Us", new Icon(VaadinIcon.QUESTION));
         aboutbtn.getStyle().set("color", "black");
         aboutbtn.getStyle().set("position", "absolute");
         aboutbtn.getStyle().set("left", "70%");
         aboutbtn.getStyle().set("border-radius", "20px");
      	//signoT2.getStyle().set("border" ,"2px solid #4CAF50");
         aboutbtn.getStyle().set("top", "4%");
         add(aboutbtn);
        aboutbtn.addClickListener( event -> this.getUI().get().navigate("about"));
         
         
         

         Button contactus= new Button("Contact us", new Icon(VaadinIcon.PHONE));
         contactus.getStyle().set("color", "black");
         contactus.getStyle().set("position", "absolute");
         contactus.getStyle().set("left", "80%");
         contactus.getStyle().set("border-radius", "20px");
      	//signoT3.getStyle().set("border" ,"2px solid #4CAF50");
         contactus.getStyle().set("top", "4%");
         contactus.addClickListener( event -> this.getUI().get().navigate("beintouch"));
         add(contactus);
	       
	        
	        
	        ////////////////labels
	     
	        
	     	
	     	
	     	Label companyname1 = new Label("Innovation Legacy  ");
	     	companyname1.getStyle().set("color", "#2B547E");
	     	companyname1.getStyle().set("font-size", "2.0em");
	     	companyname1.getStyle().set("position", "absolute");
	     	companyname1.getStyle().set("top", "3%");
	     	companyname1.getStyle().set("left", "2%");
	     	companyname1.getStyle().set("font-weight", "bold");
	     	companyname1. getStyle().set("background", "#C0C0C0\"");
	     	add(companyname1);
	     	

			
			
			Label label = new Label("Ready to have your");
	     	label.getStyle().set("color", "black");
	     	label.getStyle().set("font-size", "5.1em");
	     	label.getStyle().set("position", "absolute");
	     	label.getStyle().set("top", "35%");
	     	label.getStyle().set("font-weight", "bold");
	     	label.getStyle().set("left", "31%");
	     	
	     	
	     	add(label);
	     	
	        
	    	Label label2 = new Label("innovative app ?");
	     	label2.getStyle().set("color", "black");
	     	label2.getStyle().set("font-size", "5.1em");
	     	label2.getStyle().set("position", "absolute");
	     	label2.getStyle().set("top", "50%");
	     	label2.getStyle().set("left", "35.5%");
	     	label2.getStyle().set("font-weight", "bold");
	     	
	     	
	     	add(label2);
	     	
	     	
	     	
	     	
	     	Label label3 = new Label("we don't only code, we creatively design" );
	     	label3.getStyle().set("color", "#green");
	     	label3.getStyle().set("font-size", "1.5em");
	     	label3.getStyle().set("position", "absolute");
	     	label3.getStyle().set("top", "70%");
	     	label3.getStyle().set("left", "40%");
	     	
	     	label3.getStyle().set("font-weight", "Monospace");
	     	
	     	add(label3);
	     	
	     	
	     	Label label31 = new Label("your app to give it the look it deserves");
	     	label31.getStyle().set("color", "#green");
	     	label31.getStyle().set("font-size", "1.5em");
	     	label31.getStyle().set("position", "absolute");
	     	label31.getStyle().set("top", "75%");
	     	label31.getStyle().set("left", "40%");
	     	
	     	label31.getStyle().set("font-weight", "Monospace");
	     	
	     	add(label31);
	     	
	     	
	     	
	     	
	     	
	     	
	     	
	  	  
	          
		        
		        
		        
		        Image image11 = new Image("icons/black-smartphone-2447046.jpg", "alt");
		        image11.getStyle().set("position","absolute");
		     	image11.getStyle().set("top","93%");
		     	image11.getStyle().set("left", "0%");
		     	image11.getStyle().set("border-radius", "20px").set("border" ,"2px solid white");
		     	
		        add(image11);
		        
		        
		        Image image111 = new Image("icons/tuned-on-gray-laptop-computer-163097.jpg", "alt");
		        image111.getStyle().set("position","absolute");
		     	image111.getStyle().set("top","93%");
		     	image111.getStyle().set("right", "0%");
		     	image111.getStyle().set("border-radius", "20px").set("border" ,"2px solid white");
		     	
		        add(image111);
		        
		        Image image1 = new Image("icons/blur-close-up-code-computer-546819%20(1).jpg", "alt");
		        image1.getStyle().set("position","absolute");
		     	image1.getStyle().set("top","85%");
		     	image1.getStyle().set("left", "30%");
		     	image1.getStyle().set("border-radius", "20px").set("border" ,"2px solid white");
		     	
		        add(image1);
	     	
		        
		       

		        
		        
		      
		        
		        
		        Button line3 = new Button( );
		     	line3.setWidthFull();;
		     	line3.setHeight("40%");
		     	line3.getStyle().set("position","absolute");
		     	line3.getStyle().set("top","150%");
		     	line3.getStyle().set("left", "0%");
		     	line3.getStyle().set("background", "#2B547E");
		     	add(line3);
		        
		     	
		     	
		     	
		     	

		     	  Label label51 = new Label(" Our Vision  ");
			     	label51.getStyle().set("color", "white");
			     	label51.getStyle().set("font-size", "2.0em");
			     	label51.getStyle().set("position", "absolute");
			     	label51.getStyle().set("top", "155%");
			     	label51.getStyle().set("left", "45%");
			     	label51.getStyle().set("font-weight", "bold");
			     	add(label51);
			     	
			     	
		     	
		     	Label label6 = new Label(" To be the top South African tech company that is trusted by it's stake holders with excellent services that "+ "\n" + "we offer. We are driven to deliver innovative products and we exist to service the needs of your business , whilst building solid relationships with all our customers.");
		     	label6.getStyle().set("color", "white");
		     	label6.getStyle().set("font-size", "1.5em");
		     	label6.getStyle().set("position", "absolute");
		     	label6.getStyle().set("top", "165%");
		     	label6.getStyle().set("left", "7.5%");
		     	label6.getStyle().set("font-weight", "Monospace");
		     	add(label6);
		     	
		     	Label labe11111 = new Label("Copyright InnovationLegacy | All Rights Reserved ");
		     	labe11111.getStyle().set("color", "grey");
		     	labe11111.getStyle().set("font-size", "1.0em");
		     	labe11111.getStyle().set("position", "absolute");
		     	labe11111.getStyle().set("top", "200%");
		     	labe11111.getStyle().set("left", "35%");
		     	labe11111.getStyle().set("font-weight", "italic");
		     	add(labe11111);
		        
			   
	        
	 
	}
	

	
	
 


	
}
