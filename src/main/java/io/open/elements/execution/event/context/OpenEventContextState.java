package io.open.elements.execution.event.context;

import io.open.elements.OpenContext;

public class OpenEventContextState extends OpenContext {
    private String statusMessage;
    public String getStatusMessage() {
        return statusMessage;
    }
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
}
