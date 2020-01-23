package com.packagename.il;

import java.util.Properties;
import java.util.regex.Pattern;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("beintouch")

public class beintouch<BrowserWindowOpener> extends HorizontalLayout{
	
	
	private static final long serialVersionUID = 1L;
	
	private TextField companyName = new TextField(  );
	private TextField email = new  TextField(  );
	private TextField developType = new TextField(  );
	private TextArea msg = new TextArea(  );
	private Button save = new Button("Submit");
   
    
   
    
	public beintouch() {
		
		

    setWidthFull();
	setHeight("245%");
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
     	
     	
        Label bea = new Label("Let's have a chat");
     	bea.getStyle().set("color", "#2B547E");
     	bea.getStyle().set("font-size", "4.1em");
     	bea.getStyle().set("position", "absolute");
     	bea.getStyle().set("top", "30%");
     	bea.getStyle().set("font-weight", "bold");
     	bea.getStyle().set("left", "30%");
     	
     	bea. getStyle().set("background", "white");
     	add(bea);
     	
     	
     	
     	
     
     	
     	
     	
     	
     	
     	
     	
        
    	Label labe = new Label("Interested in discussing a project with us or want us to develop an app for you , we’d love to chat with you right away. ");
     	labe.getStyle().set("color", "black");
     	labe.getStyle().set("font-size", "1.0em");
     	labe.getStyle().set("position", "absolute");
     	labe.getStyle().set("top", "45%");
     	labe.getStyle().set("left", "15%");
     	labe.getStyle().set("font-weight", "Monospace");
     	labe. getStyle().set("background", "white");
     	add(labe);
     	
     	Label labe1 = new Label("Simply contact us using the details below or enter your details into the contact form and one of our team will be in touch. ");
     	labe1.getStyle().set("color", "black");
     	labe1.getStyle().set("font-size", "1.0em");
     	labe1.getStyle().set("position", "absolute");
     	labe1.getStyle().set("top", "50%");
     	labe1.getStyle().set("left", "15%");
     	labe1.getStyle().set("font-weight", "Monospace");
     	labe1. getStyle().set("background", "white");
     	add(labe1);
     	
     	
     	
     	
     	Image image = new Image("icons/photo-of-people-leaning-on-wooden-table-3183183.jpg", "alt");
        image.getStyle().set("position","absolute");
     	image.getStyle().set("top","60%");
     	image.getStyle().set("left", "7%");
     	image.getStyle().set("border-radius", "20px").set("border" ,"2px solid white");
     	
        add(image);
     	
     	
    	
     	
     	

     	Button sign_in_button1 = new Button( );
     	sign_in_button1.setWidth("30%");
     	sign_in_button1.setHeight("70%");
        sign_in_button1.getStyle().set("border" ,"2px solid red");
     	sign_in_button1.getStyle().set("position","absolute");
     	sign_in_button1.getStyle().set("top","150%");
     	sign_in_button1.getStyle().set("left", "15%");
     	sign_in_button1.getStyle().set("background", "white");
     	sign_in_button1.getStyle().set("color", "white");
     	add(sign_in_button1);
     	
     	
     	
    	
     	
     	
 
   	

    	email.setWidth("20%");
    	email.setPlaceholder("Email Address");
    	email.getStyle().set("background", "white").set("color", "black");
    	email.getStyle().set("position", "absolute");
    	email.getStyle().set("top", "160%").set("left", "20%");
    	add(email);
    	
    	companyName.setWidth("20%");
     	companyName.setPlaceholder("Full name/Comany name");
     	companyName.getStyle().set("background", "white").set("color", "black").set("position", "absolute").set("top", "170%").set("left", "20%");
    	add(companyName);
    	
    	developType.setWidth("20%");
    	developType.setPlaceholder("Type of development");
    	developType.getStyle().set("background", "white").set("color", "black").set("position", "absolute").set("top", "180%").set("left", "20%");
    	add(developType);
    	
    	
    	msg.setPlaceholder("Message");
    	msg.getStyle().set("background", "white").set("color", "black");
    	msg.getStyle().set("position", "absolute");
    	msg.setHeight("15%");
    	msg.setWidth("20%");
    	
    	msg.getStyle().set("top", "190%").set("left", "20%");
    	add(companyName);
    	add(msg);
    	
    	 	
    	
     	//setting the width of the button
    	save.setWidth("10%");
    	save.getStyle().set("border-radius", "20px");
    	
    	save.getStyle().set("position", "absolute");
    	save.getStyle().set("top", "210%").set("left", "25%");
    	save.getStyle().set("background", "#2B547E");
    	save.getStyle().set("color","white");
    	save.addClickListener( event -> {
			try {
				sendEmail();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
			
    	save.getStyle().set("alignItems", "center");
    	
    	add(save);
    	
    	

    	
    	
     	
     	//
     	
     	 
    	
    	

     	 Label companyname11 = new Label("Innovation Legacy  ");
      	companyname11.getStyle().set("color", "black");
      	companyname11.getStyle().set("font-size", "2.0em");
      	companyname11.getStyle().set("position", "absolute");
      	companyname11.getStyle().set("top", "160%");
      	companyname11.getStyle().set("left", "50%");
      	companyname11.getStyle().set("font-weight", "bold");
      	companyname11. getStyle().set("background", "white");
      	add(companyname11);
     	  
     	  
      	Label labe11 = new Label("Email ");
    	labe11.getStyle().set("color", "black");
    	labe11.getStyle().set("font-size", "1.1em");
    	labe11.getStyle().set("position", "absolute");
    	labe11.getStyle().set("top", "170%");
    	labe11.getStyle().set("left", "50%");
    	labe11.getStyle().set("font-weight", "normal");
    	labe11. getStyle().set("background", "#061213");
    	add(labe11);
  	  
    	Label lq = new Label("innovationlegacy@outlook.com");
    	lq.getStyle().set("color", "#2B547E");
    	lq.getStyle().set("font-size", "1.1em");
    	lq.getStyle().set("position", "absolute");
    	lq.getStyle().set("top", "175%");
    	lq.getStyle().set("left", "50%");
    	lq.getStyle().set("font-weight", "normal");
    	lq. getStyle().set("background", "white");
    	add(lq);
    	
    	
    	Label labe111 = new Label("Email ");
    	labe111.getStyle().set("color", "black");
    	labe111.getStyle().set("font-size", "1.1em");
    	labe111.getStyle().set("position", "absolute");
    	labe111.getStyle().set("top", "170%");
    	labe111.getStyle().set("left", "50%");
    	labe111.getStyle().set("font-weight", "normal");
    	labe111. getStyle().set("background", "white");
    	add(labe111);
    	
    	 
    	
    	Button round = new Button(null , new Icon(VaadinIcon.TWITTER));
        round.setIconAfterText(true);
        round.setWidth("5%");
        round.getStyle().set("top", "179%"); 
        round.getStyle().set("background", "white");
        round.getStyle().set("border-radius", "50%");
        round.getStyle().set("position", "absolute");
        round.getStyle().set("left", "45%");
     	  add(round);
     	  
     	  
     	  
     	  
     	Button round1 = new Button(null , new Icon(VaadinIcon.PHONE));
      round1.setIconAfterText(true);
      round1.setWidth("5%");
      round1.getStyle().set("top", "189%"); 
      round1.getStyle().set("background", "white");
      round1.getStyle().set("border-radius", "50%");
      round1.getStyle().set("position", "absolute");
      round1.getStyle().set("left", "45%");
   	  add(round1);
   	  
   	  
   	  
   	 Button round11 = new Button(null , new Icon(VaadinIcon.ENVELOPE));
       round11.setIconAfterText(true);
       round11.setWidth("5%");
       round11.getStyle().set("top", "169%"); 
       round11.getStyle().set("background", "white");
       round11.getStyle().set("border-radius", "50%");
       round11.getStyle().set("position", "absolute");
       round11.getStyle().set("left", "45%");
    	  add(round11);
    	
    	
    	
    	Label labe2 = new Label("Twitter ");
    	labe2.getStyle().set("color", "black");
    	labe2.getStyle().set("font-size", "1.1em");
    	labe2.getStyle().set("position", "absolute");
    	labe2.getStyle().set("top", "180%");
    	labe2.getStyle().set("left", "50%");
    	labe2.getStyle().set("font-weight", "normal");
    	labe2. getStyle().set("background", "white");
    	add(labe2);
    	
    	
    	
    	Label lq1 = new Label("@innovationslega");
    	lq1.getStyle().set("color", "#2B547E");
    	lq1.getStyle().set("font-size", "1.1em");
    	lq1.getStyle().set("position", "absolute");
    	lq1.getStyle().set("top", "185%");
    	lq1.getStyle().set("left", "50%");
    	lq1.getStyle().set("font-weight", "normal");
    	lq1. getStyle().set("background", "white");
    	add(lq1);
    	
    	
    	
    	
    	
    	
    	
    	
    	Label labe1111 = new Label("Cell Number ");
    	labe1111.getStyle().set("color", "black");
    	labe1111.getStyle().set("font-size", "1.1em");
    	labe1111.getStyle().set("position", "absolute");
    	labe1111.getStyle().set("top", "190%");
    	labe1111.getStyle().set("left", "50%");
    	labe1111.getStyle().set("font-weight", "normal");
    	labe1111. getStyle().set("background", "white");
    	add(labe1111);
    	
    	
    	
    	Label lq3 = new Label("0716268632");
    	lq3.getStyle().set("color", "#2B547E");
    	lq3.getStyle().set("font-size", "1.1em");
    	lq3.getStyle().set("position", "absolute");
    	lq3.getStyle().set("top", "195%");
    	lq3.getStyle().set("left", "50%");
    	lq3.getStyle().set("font-weight", "normal");
    	lq3. getStyle().set("background", "white");
    	add(lq3);
     	
     	
     	//
     	
     	
    	
 
     	
     	Button line3 = new Button( );
     	line3.setWidthFull();;
     	line3.setHeight("20%");
     	line3.getStyle().set("position","absolute");
     	line3.getStyle().set("top","240%");
     	line3.getStyle().set("left", "0%");
     	line3.getStyle().set("background", "#2B547E");
     	add(line3);
     	
     	
     	
     	Label labe11111 = new Label("Copyright InnovationLegacy | All Rights Reserved ");
     	labe11111.getStyle().set("color", "white");
     	labe11111.getStyle().set("font-size", "1.0em");
     	labe11111.getStyle().set("position", "absolute");
     	labe11111.getStyle().set("top", "250%");
     	labe11111.getStyle().set("left", "35%");
     	labe11111.getStyle().set("font-weight", "italic");
     	
     	add(labe11111);
            
     	
     	
     
	}	
	
	
	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
  
	
	
	
	
	
	public void sendEmail() throws MessagingException   {
		  
		
		
    	String name = this.companyName.getValue( );
    	String subject = this.developType.getValue( );
    	String email = this.email.getValue( );
    	String inboxMessage = this.msg.getValue();
    	
		
		
		
		
    	
    	if( name.equals("")  || subject .equals("") || email .equals("")|| inboxMessage.equals("")  ) {
    		Notification.show( String.format( "Make sure all the fields are entered"));
    		
    		
    		
    		
    		
    		
    	}else if( isValid(email) ) {
    		
    		
    		
    		   JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    			Properties properties = new Properties();
    			properties.put("mail.smtp.host", "smtp.gmail.com");
    			properties.put("mail.smtp.port", " 587");
    			properties.put("mail.smtp.ssl.enable", "true");

    			mailSender.setJavaMailProperties(properties);
    			
    			mailSender.setUsername("zamadlamini603@gmail.com");
    			mailSender.setPassword("resetpassword01");
    			
    			
    			
    			MimeMessage message = mailSender.createMimeMessage();
    			MimeMessageHelper helper = new MimeMessageHelper(message, true);
    			helper.setFrom("zamadlamini603@gmail.com");
    			helper.setSubject(subject);
    			helper.setText("Dear Innovation Legacy inc" + "\n" +"\n"+inboxMessage +"\n" + "Sumitted by " + email); // true to activate multipart
    			helper.addTo("innovationlegacy@outlook.com");
    			mailSender.send(message);
    			
    			Notification.show( String.format( "Submitted , We will contact soon as we can"));
    		
    		
    		
    	  }else {
    		  
    		  
    		  
    		  Notification.show( String.format( "Please enter valid email"));
    		      
    		    
    		      
    		 
    		  
    		  

    		
    	       
	}
    	
    	
    	
	
    		  
	}


}
