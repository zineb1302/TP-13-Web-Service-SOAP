package com.example.demo.entities;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "typeCompte")
@XmlEnum
public enum TypeCompte {
    COURANT,
    EPARGNE;
    
    public String value() {
        return name();
    }
    
    public static TypeCompte fromValue(String v) {
        return valueOf(v);
    }
}

