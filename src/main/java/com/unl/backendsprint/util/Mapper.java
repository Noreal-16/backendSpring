package com.unl.backendsprint.util;

import org.modelmapper.ModelMapper;

public class Mapper {
    private Mapper(){
        throw new IllegalStateException("No se puede instanciar un utilitario");
    }
    public static ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
