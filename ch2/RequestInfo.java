package com.fastcampus.ch2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RequestInfo {
    @RequestMapping("/requestInfo")
    public void main(HttpServletRequest request) {
        System.out.println("request.getCharacterEncoding()="+request.getCharacterEncoding()); // encoding of request content
        System.out.println("request.getContentLength()="+request.getContentLength());  // ��û ������ ����. �˼� ���� ���� -1
        System.out.println("request.getContentType()="+request.getContentType()); // ��û ������ Ÿ��. �� �� ���� ���� null

        System.out.println("request.getMethod()="+request.getMethod());      // method of request
        System.out.println("request.getProtocol()="+request.getProtocol());  // protocol version HTTP/1.1
        System.out.println("request.getScheme()="+request.getScheme());      // protocol

        System.out.println("request.getServerName()="+request.getServerName()); // server name or ip address
        System.out.println("request.getServerPort()="+request.getServerPort()); // server port
        System.out.println("request.getRequestURL()="+request.getRequestURL()); // request URL
        System.out.println("request.getRequestURI()="+request.getRequestURI()); // request URI

        System.out.println("request.getContextPath()="+request.getContextPath()); // context path
        System.out.println("request.getServletPath()="+request.getServletPath()); // servlet path
        System.out.println("request.getQueryString()="+request.getQueryString()); //query string 

        System.out.println("request.getLocalName()="+request.getLocalName()); // ���� �̸�
        System.out.println("request.getLocalPort()="+request.getLocalPort()); // ���� ��Ʈ

        System.out.println("request.getRemoteAddr()="+request.getRemoteAddr()); // ���� ip�ּ�
        System.out.println("request.getRemoteHost()="+request.getRemoteHost()); // ���� ȣ��Ʈ �Ǵ� ip�ּ�
        System.out.println("request.getRemotePort()="+request.getRemotePort()); // ���� ��Ʈ
    }
}