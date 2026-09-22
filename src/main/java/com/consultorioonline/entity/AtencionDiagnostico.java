package com.consultorioonline.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "atenciones_diagnosticos")
public class AtencionDiagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_atencion_diagnostico")
    private Long idAtencionDiagnostico;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_atencion", nullable = false)
    private AtencionMedica atencion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_diagnostico", nullable = false)
    private Diagnostico diagnostico;

    @Column(name = "tipo_diagnostico", length = 30, nullable = false)
    private String tipoDiagnostico;

    @Column(name = "observaciones", length = 500)
    private String observaciones;

    public AtencionDiagnostico() {
    }

    public Long getIdAtencionDiagnostico() {
        return idAtencionDiagnostico;
    }

    public void setIdAtencionDiagnostico(Long idAtencionDiagnostico) {
        this.idAtencionDiagnostico = idAtencionDiagnostico;
    }

    public AtencionMedica getAtencion() {
        return atencion;
    }

    public void setAtencion(AtencionMedica atencion) {
        this.atencion = atencion;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTipoDiagnostico() {
        return tipoDiagnostico;
    }

    public void setTipoDiagnostico(String tipoDiagnostico) {
        this.tipoDiagnostico = tipoDiagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}