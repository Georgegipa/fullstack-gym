package com.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException
{
    private final String resourceName;
    private final String fieldName;
    private final int fieldValue;

    public ResourceNotFoundException(String resourceName, String fieldName, int fieldValue)
    {
        super(resourceName + " not found with " + fieldName  + " : " + fieldValue);
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getResourceName()
    {
        return resourceName;
    }

    public String getFieldName()
    {
        return fieldName;
    }

    public int getFieldValue()
    {
        return fieldValue;
    }
}