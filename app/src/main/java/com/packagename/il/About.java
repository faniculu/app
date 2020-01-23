package com.packagename.il;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;  

  



@Route("about")

public class About extends HorizontalLayout{
	
	
	private static final long serialVersionUID = 1L;
	
	private TextField name = new TextField(  );
	private TextField email = new  TextField(  );
	private TextField surname = new TextField(  );
	private TextField phoneNumberField = new TextField(  );
	private Button save = new Button("Get in touch");
	
	
    public About() {
		
		

    setWidthFull();
	setHeight("150%");
    setAlignItems(Alignment.CENTER);
    getStyle().set("background", "#FFFFFF");
    
    
    

    
 
        
 	
 	
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
    
    
    
   
        
        

     
	        

        Label companyname1 = new Label("Innovation Legacy  ");
     	companyname1.getStyle().set("color", "#2B547E");
     	companyname1.getStyle().set("font-size", "2.0em");
     	companyname1.getStyle().set("position", "absolute");
     	companyname1.getStyle().set("top", "3%");
     	companyname1.getStyle().set("left", "2%");
     	companyname1.getStyle().set("font-weight", "bold");
     	companyname1. getStyle().set("background", "#C0C0C0\"");
     	add(companyname1);
     	
     	  Label bea = new Label("Want to know about us");
       	bea.getStyle().set("color", "#2B547E");
       	bea.getStyle().set("font-size", "4.1em");
       	bea.getStyle().set("position", "absolute");
       	bea.getStyle().set("top", "30%");
       	bea.getStyle().set("font-weight", "bold");
       	bea.getStyle().set("left", "30%");
       	
       	bea. getStyle().set("background", "white");
       	add(bea);
     	
     	
     	
     	
     
     	
     	
     	
     	
     	
     	
     	
        
    	Label labe = new Label("We are a small freelance company that specialises");
     	labe.getStyle().set("color", "black");
     	labe.getStyle().set("font-size", "1.0em");
     	labe.getStyle().set("position", "absolute");
     	labe.getStyle().set("top", "45%");
     	labe.getStyle().set("left", "40%");
     	labe.getStyle().set("font-weight", "Monospace");
     	labe. getStyle().set("background", "white");
     	add(labe);
     	
     	Label labe1 = new Label("in websites , mobile applications and desktop  ");
     	labe1.getStyle().set("color", "black");
     	labe1.getStyle().set("font-size", "1.0em");
     	labe1.getStyle().set("position", "absolute");
     	labe1.getStyle().set("top", "50%");
     	labe1.getStyle().set("left", "40%");
     	labe1.getStyle().set("font-weight", "Monospace");
     	labe1. getStyle().set("background", "white");
     	add(labe1);
     	
     	Label labe11 = new Label("applications. Our team is on the standby to turn");
     	labe11.getStyle().set("color", "black");
     	labe11.getStyle().set("font-size", "1.0em");
     	labe11.getStyle().set("position", "absolute");
     	labe11.getStyle().set("top", "55%");
     	labe11.getStyle().set("left", "40%");
     	labe11.getStyle().set("font-weight", "Monospace");
     	labe11. getStyle().set("background", "white");
     	add(labe11);
     	
     	
     	Label labe111 = new Label(" your ideas into a reality.");
     	labe111.getStyle().set("color", "black");
     	labe111.getStyle().set("font-size", "1.0em");
     	labe111.getStyle().set("position", "absolute");
     	labe111.getStyle().set("top", "60%");
     	labe111.getStyle().set("left", "40%");
     	labe111.getStyle().set("font-weight", "Monospace");
     	labe111. getStyle().set("background", "white");
     	add(labe111);
     	
     	
     	
     	
 
     	
    	
    	
    	
     	//setting the width of the button
    	
    	
    	/*
    	
    	
    	Label labe1111 = new Label("4th Industrial revolution is , let us make you part of it ");
     	labe1111.getStyle().set("color", "#2B547E").set("border" ,"2px solid #4CAF50").set("border-radius", "20px");
     	labe1111.getStyle().set("font-size", "1.5em");
     	labe111.setWidth("55%");
     	labe1111.getStyle().set("position", "absolute");
     	labe1111.getStyle().set("top", "75%");
     	
     	labe1111.getStyle().set("font-weight", "bold");
     	labe1111. getStyle().set("background", "white");
     	add(labe1111);
     	
     	*/
     	
     	
 	
     	
     	/*
     	
     	Button line3 = new Button( );
     	line3.setWidthFull();;
     	line3.setHeight("40%");
     	line3.getStyle().set("position","absolute");
     	line3.getStyle().set("top","115%");
     	line3.getStyle().set("left", "0%");
     	line3.getStyle().set("background", "#FFA500");
     	add(line3);
            
     	*/
     	
     	
     	

        Image image1 = new Image("icons/person-in-front-of-laptop-on-brown-wooden-table-2115217.jpg", "alt");
        image1.getStyle().set("position","absolute");
     	image1.getStyle().set("top","60%");
     	image1.getStyle().set("left", "8%");
     	image1.getStyle().set("border-radius", "20px").set("border" ,"2px solid white");
     	
        add(image1);
 	
        save.setWidth("17%");
    	save.getStyle().set("border-radius", "20px");
    	save.getStyle().set("border" ,"2px solid #3BB9FF");
    	save.getStyle().set("position", "absolute");
    	save.getStyle().set("top", "70%").set("left", "43%");
    	save.getStyle().set("color","white");
    	save.addClickListener( event -> this.getUI().get().navigate("beintouch"));
    	save.getStyle().set("alignItems", "center");
    	
    	add(save);
	     	
	     	
	     	
	     	
	     	
	     	
	     	
	     	
	     	
	     	

	     	  Label label5 = new Label(" Why Innovations Legacy  ");
		     	label5.getStyle().set("color", "white");
		     	label5.getStyle().set("font-size", "2.0em");
		     	label5.getStyle().set("position", "absolute");
		     	label5.getStyle().set("top", "80%");
		     	label5.getStyle().set("left", "38%");
		     	label5.getStyle().set("font-weight", "bold");
		     	
		     	add(label5);
		     	
		     	
		     	
		     	Label label6 = new Label(" Our team has developers working on the front end separetely to make sure that we give your application the feel ");
		     	label6.getStyle().set("color", "white");
		     	label6.getStyle().set("font-size", "1.5em");
		     	label6.getStyle().set("position", "absolute");
		     	label6.getStyle().set("top", "100%");
		     	label6.getStyle().set("left", "10%");
		     	label6.getStyle().set("font-weight", "Monospace");
		     
		     	add(label6);
		     	
		     	Label label7 = new Label(" it deserves and developers working on the back end separetely to make sure  that your application delivers the ");
		     	label7.getStyle().set("color", "white");
		     	label7.getStyle().set("font-size", "1.5em");
		     	label7.getStyle().set("position", "absolute");
		     	label7.getStyle().set("top", "110%");
		     	label7.getStyle().set("left", "10%");
		     	label7.getStyle().set("font-weight", "Monospace");
		     	
		     	add(label7);
		     	
		     	
		    	Label label71 = new Label(" information that your business needs to grow in the 4th industrial revolution.");
		     	label71.getStyle().set("color", "white");
		     	label71.getStyle().set("font-size", "1.5em");
		     	label71.getStyle().set("position", "absolute");
		     	label71.getStyle().set("top", "117%");
		     	label71.getStyle().set("left", "10%");
		     	label71.getStyle().set("font-weight", "Monospace");
		     	
		     	add(label71);
		     	
		     	
		     	
		     	Label label711 = new Label(" .. WE SIMPLY CARE ..");
		     	label711.getStyle().set("color", "white");
		     	label711.getStyle().set("font-size", "3.0em");
		     	label711.getStyle().set("position", "absolute");
		     	label711.getStyle().set("top", "140%");
		     	label711.getStyle().set("left", "40%");
		     	label711.getStyle().set("font-weight", "Monospace");
		     	
		     	add(label711);
		     	
		     	
		     	
		     	
		     	

		     	
		     	
		     	
		     	
		     	
		     	
		     	
		     	

	     	
		     	
		     	Label labe11111 = new Label("Copyright InnovationLegacy | All Rights Reserved ");
		     	labe11111.getStyle().set("color", "grey");
		     	labe11111.getStyle().set("font-size", "1.0em");
		     	labe11111.getStyle().set("position", "absolute");
		     	labe11111.getStyle().set("top", "200%");
		     	labe11111.getStyle().set("left", "35%");
		     	labe11111.getStyle().set("font-weight", "italic");
		     	add(labe11111);
		     	
     	
	}	
	
	
	
	
	
	
	public void sendEmail() {
		  
		
    	String name = this.name.getValue( );
    	String surname = this.surname.getValue( );
    	String email = this.email.getValue( );
    	String phonenum = this.phoneNumberField.getValue();
    	
    	
    	if( name.equals("")  || surname .equals("") || email .equals("")|| phonenum.equals("")  ) {
    		Notification.show( String.format( "Make sure all the fields are entered"));
    	}else if( !email.contains("@") ) {
    		Notification.show( String.format( "Please enter valid email"));
    	  }else {
    		  
    		
    	       
	}
	}
}