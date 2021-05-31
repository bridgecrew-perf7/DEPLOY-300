package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

/**
 * Example Index HTML class using Javalin
 * <p>
 * Generate a static HTML page using Javalin
 * by writing the raw HTML into a Java String object
 *
 * @author Timothy Wiley, 2021. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class Index implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = " <!DOCTYPE html>";
        html = html  + "<html lang=\"en\">";
        html = html + "<head>";
        html = html + "<meta charset=\"UTF-8\">";
        html = html + "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">";
        html = html + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">";
        html = html + "<link rel=\"stylesheet\" href=\"style.css\">";
        html = html + "<link rel = \"stylesheet\" href=\"stylesheet.css\">";
        html = html + "<link rel=\"stylesheet\" href = \"hover-min.css\">";
        html = html + "<title>Document</title>";
        html = html + "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">";
        html = html + "<link href=\"https://fonts.googleapis.com/css2?family=IBM+Plex+Sans&display=swap\" rel=\"stylesheet\">";
        html = html + "</head>";
        html = html + "<body>";
        html = html + "<div class=\"topnav\">";
        html = html + "<a href = \"/\"><img src=\"icon.png\" style = \"width: 10vh;\"></a>";
        html = html + "<a  href=\"index.html\" class=\"hvr-underline-from-center active\" >Home</a>";
        html = html + " <a href = \"page1.html\" class =\"hvr-underline-from-center\">World Stats</a>";
        html = html + "  <a href=\"level2.html\" class=\"hvr-underline-from-center\">Map</a>";
        html = html + " <a href=\"#about\" class=\"hvr-underline-from-center\">Detailed Reports</a>";
        html = html + " </div> ";
        html = html + " <div class=\"wrapper\">";
        html = html + " <div class=\"header\">";
        html = html + "<div class=\"grid-container\">";
        html = html + " <p></p> <p id=\"title\" >COVID-19</p> <p></p>";
        html = html + " <button class=\"butt1\"><div class=\"buttontextnav\">Countries</div></button>";
        html = html + " <button class=\"butt2\"><div class=\"buttontextnav\"> <a href=\"https://www.who.int/southeastasia/outbreaks-and-emergencies/novel-coronavirus-2019/protective-measures/stay-healthy-at-home\" class=\"buttontextnav\" target=\"_blank\">How to stay safe?</a></div></button>";
        html = html + " <button class=\"butt3\"><div class=\"buttontextnav\"> <a href=\"https://www.who.int/health-topics/vaccines-and-immunization#tab=tab_1\" class=\"buttontextnav\" target=\"_blank\">Vaccines</a></div></button>";
                       
        html = html + "</div>";
        html = html + "</div>";
        html = html + "<article class=\"main\">";
        html = html + "<p class=\"symptomstitle\">Symptoms</p> "; 
        html = html + "<p class=\"text-main\">Coronavirus disease (COVID-19) is an infectious disease caused by a newly discovered coronavirus.";
        html = html + "<p class=\"text-main\"> Most people infected with the COVID-19 virus will experience mild to moderate respiratory illness and recover without requiring special treatment.  Older people, and those with underlying medical problems like cardiovascular disease, diabetes, chronic respiratory disease, and cancer are more likely to develop serious illness.</p>";
        html = html + "<p class=\"text-main\"> The best way to prevent and slow down transmission is to be well informed about the COVID-19 virus, the disease it causes and how it spreads. Protect yourself and others from infection by washing your hands or using an alcohol based rub frequently and not touching your face.</p>";
        html = html + "<p class=\"text-main\">The COVID-19 virus spreads primarily through droplets of saliva or discharge from the nose when an infected person coughs or sneezes, so it’s important that you also practice respiratory etiquette</p>";
        html = html + "</article>";
                
        html = html + "<div class=\"aside aside-1\">";
                        
        html = html + " <button class=\"butt4\"><a class=\"buttontext\" href=\"level2.html\" style=\"text-decoration: none;\">MAP</a></button>";
        html = html + " <button class=\"butt4\" ><a class=\"buttontext\" href = \"page1.html\" style=\"text-decoration: none;\">WORLD STATISTICS</a></button>";
        
        html = html + " </div>";
        html = html + "<aside class=\"aside aside-2\">";
        html = html + "<p class=\"overviewtitle\">Overview</p>";
        html = html + "<p class=\"text-main\">COVID-19 affects different people in different ways. Most infected people will develop mild to moderate illness and recover without </p>";
        
        html = html + " <p class=\"overviewtitle\">Most common symptoms:</p>";
        
        html = html + " <ul class=\"text-main\"> ";
        html = html + "     <li>Fever.</li>";
        html = html + "     <li>Dry cough.</li>";
        html = html + "     <li>Tiredness.</li>";
        html = html + "</ul>";
        
        html = html + "<p class=\"overviewtitle\">Less common symptoms:</p>";
        
        html = html + " <ul class=\"text-main\">";
        html = html + "     <li>Aches and pains.</li>";
        html = html + " <li>Sore throat.</li>";
        html = html + " </ul>";
        
        
        html = html + "<p class=\"text-main\"> <img src=\"https://cdn.iconscout.com/icon/free/png-256/warning-190-457484.png\" class=\"warningicon\" alt=\"warningicon\"> If you are experiencing any of the symptoms above please contact your doctor/chemist.</p> ";
        html = html + "</aside>";
        html = html + "</div>";
        
              html = html + "<a href=\"#head\"><img src=\"data:image/png;base64,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\" id=\"fixedbutton\"></a>";
        
        
              html = html + "</body>";
              html = html + "</html>";

        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

}
