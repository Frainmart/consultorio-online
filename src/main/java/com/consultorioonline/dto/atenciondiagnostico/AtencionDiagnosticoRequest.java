package com.consultorioonline.dto.atenciondiagnostico;

public class AtencionDiagnosticoRequest {

    private Long atencionId;
    private Long diagnosticoId;
    private String tipoDiagnostico;
    private String observaciones;

    public AtencionDiagnosticoRequest() {
    }

    public Long getAtencionId() { return atencionId; }

    public void setAtencionId(Long atencionId) { this.atencionId = atencionId; }

    public Long getDiagnosticoId() { return diagnosticoId; }

    public void setDiagnosticoId(Long diagnosticoId) { this.diagnosticoId = diagnosticoId; }

    public String getTipoDiagnostico() { return tipoDiagnostico; }

    public void setTipoDiagnostico(String tipoDiagnostico) { this.tipoDiagnostico = tipoDiagnostico; }

    public String getObservaciones() { return observaciones; }

    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

}
