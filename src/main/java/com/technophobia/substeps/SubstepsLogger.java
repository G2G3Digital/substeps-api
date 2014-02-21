package com.technophobia.substeps;

/**
 * @author rbarefield
 */
public interface SubstepsLogger
{
    void info(String message);

    void debug(String message);

    void error(String message);

    void error(String message, Throwable cause);
}
