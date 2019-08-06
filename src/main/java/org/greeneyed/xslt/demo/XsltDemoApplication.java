package org.greeneyed.xslt.demo;

import org.greeneyed.summer.config.enablers.EnableSummer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSummer(xslt_view = true, xml_view_pooling = true, log4j = false)
public class XsltDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(XsltDemoApplication.class, args);
	}

}
