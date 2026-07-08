package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import org.springframework.stereotype.Service;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.InputStream;
import java.util.*;

@Service
public class CountryService {

    public Country getCountry(String code) {
        List<Country> list = getCountryList();

        for (Country c : list) {
            if (c.getCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        return null;
    }

    private List<Country> getCountryList() {
        List<Country> list = new ArrayList<>();

        try {
            InputStream is = getClass()
                    .getClassLoader()
                    .getResourceAsStream("country.xml");

            DocumentBuilder builder = DocumentBuilderFactory
                    .newInstance()
                    .newDocumentBuilder();

            Document doc = builder.parse(is);

            NodeList nodes = doc.getElementsByTagName("country");

            for (int i = 0; i < nodes.getLength(); i++) {
                Element e = (Element) nodes.item(i);

                String code = e.getElementsByTagName("code")
                        .item(0).getTextContent();

                String name = e.getElementsByTagName("name")
                        .item(0).getTextContent();

                list.add(new Country(code, name));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}