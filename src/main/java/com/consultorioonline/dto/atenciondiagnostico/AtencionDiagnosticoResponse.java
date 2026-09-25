package com.consultorioonline.dto.atenciondiagnostico;

public class AtencionDiagnosticoResponse {

    private Long idAtencionDiagnostico;
    private Long atencionId;
    private Long diagnosticoId;
    private String tipoDiagnostico;
    private String observaciones;

    public AtencionDiagnosticoResponse() {
    }

    public Long getIdAtencionDiagnostico() { return idAtencionDiagnostico; }

    public void setIdAtencionDiagnostico(Long idAtencionDiagnostico) { this.idAtencionDiagnostico = idAtencionDiagnostico; }

    public Long getAtencionId() { return atencionId; }

    public void setAtencionId(Long atencionId) { this.atencionId = atencionId; }

    public Long getDiagnosticoId() { return diagnosticoId; }

    public void setDiagnosticoId(Long diagnosticoId) { this.diagnosticoId = diagnosticoId; }

    public String getTipoDiagnostico() { return tipoDiagnostico; }

    public void setTipoDiagnostico(String tipoDiagnostico) { this.tipoDiagnostico = tipoDiagnostico; }

    public String getObservaciones() { return observaciones; }

    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

}
