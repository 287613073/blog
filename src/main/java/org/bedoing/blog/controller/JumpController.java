package org.bedoing.blog.controller;

import javax.servlet.http.HttpServletRequest;

import org.bedoing.blog.constant.UriConstant;
import org.bedoing.blog.po.LoginAccount;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author Ken
 * 
 */
@Controller
@RequestMapping("/place")
public class JumpController extends BaseController {

	// 菜单
	@RequestMapping(value = "/default")
	public ModelAndView toDefault() {
		return new ModelAndView(UriConstant.DEFAULT_DEFAULT);
	}

	@RequestMapping(value = "/portfolio")
	public ModelAndView toPortfolio() {
		return new ModelAndView(UriConstant.DEFAULT_PORTFOLIO);
	}

	@RequestMapping(value = "/blog")
	public ModelAndView toBlog() {
		return new ModelAndView(UriConstant.DEFAULT_BLOG);
	}
	
	@RequestMapping(value = "/subject")
	public ModelAndView toSubject() {
		return new ModelAndView("default/subject");
	}

	@RequestMapping(value = "/services")
	public ModelAndView toServices() {
		return new ModelAndView(UriConstant.DEFAULT_SERVICES);
	}

	@RequestMapping(value = "/about")
	public ModelAndView toAbout() {
		return new ModelAndView(UriConstant.DEFAULT_ABOUT);
	}

	@RequestMapping(value = "/contact")
	public ModelAndView toContact() {
		return new ModelAndView(UriConstant.DEFAULT_CONTACT);
	}

	@RequestMapping(value = "/registe")
	public ModelAndView toRegiste() {
		return new ModelAndView(UriConstant.DEFAULT_REGISTE);
	}

	@RequestMapping(value = "/login")
	public ModelAndView toLogin(HttpServletRequest request) {
		LoginAccount user = getUserInfo(request);
		if (null != user) {
			return new ModelAndView(UriConstant.ADMIN_INDEX);
		}
		return new ModelAndView(UriConstant.ADMIN_LOGIN);
	}

	@RequestMapping(value = "/articleByTag")
	public ModelAndView toArtidcleByTag(String tagName) {
		return new ModelAndView(UriConstant.DEFAULT_BLOG_ARTICLE_BY_TAG)
				.addObject("tagName", tagName);
	}

	// TODO
	@RequestMapping(value = "/comment")
	public ModelAndView toComment() {
		ModelAndView mv = new ModelAndView(UriConstant.DEFAULT_COMMENT);

		return mv;
	}
}
