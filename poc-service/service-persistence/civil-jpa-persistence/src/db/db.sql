@funcs@

CREATE TABLE DatoMercantilContrato
(
    Id char(36) PRIMARY KEY NOT NULL,
    Apellidos varchar(512),
    Nombres varchar(512),
    RazonSocial varchar(512),
    CedulaRuc varchar(512),
    TipoContrato varchar(512),
    FechaInscripcion datetime,
    NumeroInscripcion varchar(512),
    Compareciente varchar(512),
    Compania varchar(512),
    Representante varchar(512),
    Estado varchar(512),
    FechaCancelacion datetime,
    ChasisSerie varchar(512),
    Placa varchar(512),
    Motor varchar(512),
    Marca varchar(512),
    Modelo varchar(512),
    AnioFabricacion varchar(512),
    IdUnicoSistemaRemoto varchar(512),
    UbicacionDato varchar(512),
    UltimaModificacionFuente datetime,
    FechaSistema datetime
)

CREATE TABLE DatoMercantilSocietario
(
    Id char(36) PRIMARY KEY NOT NULL,
    NombreCompania varchar(512),
    Ruc varchar(512),
    TipoCompania varchar(512),
    FechaInscripcion varchar(512),
    ApellidosAdministrador varchar(512),
    NombresAdministrador varchar(512),
    CedulaAdministrador varchar(512),
    Cargo varchar(512),
    Disposicion varchar(512),
    Autoridad varchar(512),
    FechaDisposicion varchar(512),
    NumeroDisposicion varchar(512),
    FechaEscritura varchar(512),
    Notaria varchar(512),
    TipoTramite varchar(512),
    IdUnicoSistemaRemoto varchar(512),
    UbicacionDato varchar(512),
    UltimaModificacionFuente datetime,
    FechaSistema datetime
)
