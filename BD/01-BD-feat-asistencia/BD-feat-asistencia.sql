
-- Table 'promociones'
CREATE TABLE promociones (
  id_promo INT NOT NULL PRIMARY KEY,
  nombre VARCHAR(30) NOT NULL,
  descripcion VARCHAR(200) NOT NULL,
  precio_v DECIMAL(10,2) NOT NULL
);

-- Table 'producto'
CREATE TABLE producto (
  id_producto INT NOT NULL PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  categoria VARCHAR(30) NOT NULL,
  descripcion VARCHAR(200) NOT NULL,
  precio_v DECIMAL(10,2) NOT NULL
);

-- Table 'promo_producto'
CREATE TABLE promo_producto (
  idPromociones INT NOT NULL,
  id_producto INT NOT NULL,
  PRIMARY KEY (idPromociones, id_producto),
  CONSTRAINT fk_Promociones_has_producto_Promociones1
    FOREIGN KEY (idPromociones)
    REFERENCES promociones (id_promo),
  CONSTRAINT fk_Promociones_has_producto_producto1
    FOREIGN KEY (id_producto)
    REFERENCES producto (id_producto)
);

-- Table 'cliente'
CREATE TABLE cliente (
  id_cliente INT NOT NULL PRIMARY KEY,
  dni VARCHAR(8) NOT NULL,
  nombre VARCHAR(30) NOT NULL,
  apellido_p VARCHAR(20) NOT NULL,
  apellido_m VARCHAR(20) NOT NULL,
  celular VARCHAR(9) NULL,
  f_nacimiento DATE NOT NULL,
  sexo VARCHAR(1) NOT NULL
);

-- Table 'empleado'
CREATE TABLE empleado (
  id_empleado INT NOT NULL PRIMARY KEY,
  dni VARCHAR(8) NOT NULL,
  nombre VARCHAR(30) NOT NULL,
  apellido_p VARCHAR(20) NOT NULL,
  apellido_m VARCHAR(20) NOT NULL,
  celular VARCHAR(9) NOT NULL,
  f_nacimiento DATE NOT NULL,
  sexo VARCHAR(1) NOT NULL,
  rol VARCHAR(15) NOT NULL,
  usuario VARCHAR(15) NOT NULL,
  passw VARCHAR(15) NOT NULL
);

-- Table 'boleta'
CREATE TABLE boleta (
  id_boleta INT NOT NULL PRIMARY KEY,
  id_cliente INT NOT NULL,
  id_empleado INT NOT NULL,
  fecha_emision DATE NOT NULL,
  met_pago VARCHAR(10) NOT NULL,
  total DECIMAL(10,2) NOT NULL,
  estado VARCHAR(10) NOT NULL,
  CONSTRAINT boleta_ibfk_1
    FOREIGN KEY (id_cliente)
    REFERENCES cliente (id_cliente),
  CONSTRAINT boleta_ibfk_2
    FOREIGN KEY (id_empleado)
    REFERENCES empleado (id_empleado)
);

-- Table 'asistencia_empleados'
CREATE TABLE asistencia_empleados (
  id_asistencia INT NOT NULL PRIMARY KEY IDENTITY(1,1),
  id_empleado INT NOT NULL,
  dia DATE NOT NULL,
  marca_entrada TIME NOT NULL,
  marca_salida TIME,
  CONSTRAINT asistencia_empleados_ibfk_1
    FOREIGN KEY (id_empleado)
    REFERENCES empleado (id_empleado)
);

-- Table 'insumo'
CREATE TABLE insumo (
  id_insumo INT NOT NULL PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL,
  categoria VARCHAR(30) NOT NULL,
  precio_insumo DECIMAL(10,2) NOT NULL,
  cantidad DECIMAL(10,1) NOT NULL,
  cantidad_metrica VARCHAR(4) NOT NULL,
  precio_u DECIMAL(10,2) NOT NULL
);

-- Table 'ventadetalle'
CREATE TABLE ventadetalle (
  id_ventaDetalle INT NOT NULL PRIMARY KEY,
  id_producto INT NOT NULL,
  id_boleta INT NOT NULL,
  id_promo INT NOT NULL,
  CONSTRAINT ventadetalle_ibfk_1
    FOREIGN KEY (id_producto)
    REFERENCES producto (id_producto),
  CONSTRAINT ventadetalle_ibfk_2
    FOREIGN KEY (id_boleta)
    REFERENCES boleta (id_boleta),
  CONSTRAINT fk_ventadetalle_promociones1
    FOREIGN KEY (id_promo)
    REFERENCES promociones (id_promo)
);

-- Table 'orden'
CREATE TABLE orden (
  id_orden INT NOT NULL PRIMARY KEY,
  id_ventaDetalle INT NOT NULL,
  tipo VARCHAR(10) NOT NULL,
  estado VARCHAR(10) NOT NULL,
  ordencol VARCHAR(45),
  CONSTRAINT orden_ibfk_1
    FOREIGN KEY (id_ventaDetalle)
    REFERENCES ventadetalle (id_ventaDetalle)
);

-- Table 'receta'
CREATE TABLE receta (
  id_receta INT NOT NULL PRIMARY KEY,
  id_producto INT NULL,
  precio_p DECIMAL(10,2) NULL,
  CONSTRAINT receta_ibfk_1
    FOREIGN KEY (id_producto)
    REFERENCES producto (id_producto)
);

-- Table 'receta_insumo'
CREATE TABLE receta_insumo (
  id_receta INT NOT NULL,
  id_insumo INT NOT NULL,
  cantidad DECIMAL(10,2) NOT NULL,
  CONSTRAINT receta_insumo_ibfk_1
    FOREIGN KEY (id_receta)
    REFERENCES receta (id_receta),
  CONSTRAINT receta_insumo_ibfk_2
    FOREIGN KEY (id_insumo)
    REFERENCES insumo (id_insumo)
);
