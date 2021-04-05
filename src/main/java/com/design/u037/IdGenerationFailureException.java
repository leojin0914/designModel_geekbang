package com.design.u037;

import java.net.UnknownHostException;

/**
 * @author leojin
 */
public class IdGenerationFailureException extends RuntimeException {
    String tips;

    public IdGenerationFailureException(String tips, UnknownHostException e) {
        this.tips = tips;
    }
}
