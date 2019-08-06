package org.greeneyed.xslt.demo.controllers;

import org.greeneyed.summer.config.XsltConfiguration.XsltModelAndView;
import org.greeneyed.xslt.demo.model.App;
import org.greeneyed.xslt.demo.services.PojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class XsltDemoAPI {

	private final PojoService pojoService;

	@RequestMapping(value = "/test")
	public ModelAndView testInterface() {
		App app = new App("Listing", pojoService.getPojos());
		return new XsltModelAndView("pojo-process", app);
	}
}
