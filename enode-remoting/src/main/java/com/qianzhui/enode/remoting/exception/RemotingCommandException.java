package com.qianzhui.enode.remoting.exception;

/**
 * Created by xujunbo on 18-1-19.
 */
public class RemotingCommandException extends RemotingException {
    private static final long serialVersionUID = 7266556468345131264L;

    public RemotingCommandException(String message) {
        super(message);
    }

    public RemotingCommandException(String message, Throwable cause) {
        super(message, cause);
    }
}
