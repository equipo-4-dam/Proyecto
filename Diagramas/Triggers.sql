--Auto id para CARGO>
CREATE OR REPLACE TRIGGER CARGOSTR
  BEFORE INSERT ON CARGOS FOR EACH ROW
  WHEN (NEW.ID_CARGO IS NULL)
DECLARE
  V_ID CARGOS.ID_CARGO%TYPE;
BEGIN
  SELECT CARGOSID.NEXTVAL INTO V_ID FROM DUAL;
 :NEW.ID_CARGO:= V_ID;
END;
--Auto id para TIPO_ACTIVIDAD>
CREATE OR REPLACE TRIGGER TIPO_ACTIVIDADTR
  BEFORE INSERT ON TIPO_ACTIVIDADES FOR EACH ROW
  WHEN (NEW.ID_TIPO IS NULL)
DECLARE
  V_ID TIPO_ACTIVIDADES.ID_TIPO%TYPE;
BEGIN
  SELECT TIPOACTIVIDADID.NEXTVAL INTO V_ID FROM DUAL;
 :NEW.ID_TIPO:= V_ID;
END;

--Auto id para TIPO_CUOTA>
CREATE OR REPLACE TRIGGER TIPOCUOTASTR
BEFORE INSERT ON TIPO_CUOTAS FOR EACH ROW
WHEN (NEW.ID_CUOTA IS NULL)
DECLARE
 V_ID TIPO_CUOTAS.ID_CUOTA%TYPE;
BEGIN
 SELECT TIPOCUOTASID.NEXTVAL INTO V_ID FROM DUAL;
 :NEW.ID_CUOTA := V_ID;
END;

--Auto id para actividades><
CREATE OR REPLACE TRIGGER ACTIVIDADESTR
  BEFORE INSERT ON ACTIVIDADES FOR EACH ROW
  WHEN (NEW.ID_ACTIVIDAD IS NULL)
DECLARE
  V_ID ACTIVIDADES.ID_ACTIVIDAD%TYPE;
BEGIN
  SELECT ACTIVIDADESID.NEXTVAL INTO V_ID FROM DUAL;
 :NEW.ID_ACTIVIDAD:= V_ID;
END;

--Auto id para socios>
CREATE OR REPLACE TRIGGER SOCIOSTR
  BEFORE INSERT ON SOCIOS FOR EACH ROW
  WHEN (NEW.ID_SOCIO IS NULL)
DECLARE
  V_ID SOCIOS.ID_SOCIO%TYPE;
BEGIN
  SELECT SOCIOSID.NEXTVAL INTO V_ID FROM DUAL;
 :NEW.ID_SOCIO:= V_ID;
END;

--Trigger para cambiar el perfil de usuario a administrador al registrarlo
--en la tabla Nombramientos
CREATE OR REPLACE TRIGGER cambiar_perfil
AFTER INSERT 
ON NOMBRAMIENTOS FOR EACH ROW
DECLARE
    v_idSocio NUMBER(6);
BEGIN
    SELECT ID_SOCIO INTO v_idSocio 
    FROM SOCIOS
    WHERE ID_SOCIO = :NEW.ID_SOCIO;
        
    UPDATE SOCIOS
    SET PERFIL = 'ADMINISTRADOR'
    WHERE ID_SOCIO = v_idSocio;
END;

