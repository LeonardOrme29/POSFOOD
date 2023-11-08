-- Tabla 'empleado'
SELECT * FROM empleado;
-- Tabla 'asistencia_empleados'
INSERT INTO asistencia_empleados (id_empleado,dia, marca_entrada, marca_salida)
VALUES
  (1,'2023-04-01', '08:00:00', '17:00:00'),
  (2,'2023-04-01', '09:30:00', '18:30:00'),
  (1,'2023-04-02', '07:00:00', '16:00:00'),
  (3,'2023-04-01','07:45:00', '16:30:00');
 SELECT * FROM asistencia_empleados;-- toda la tabla
 SELECT * FROM asistencia_empleados WHERE id_empleado =1; --para obtener todo el historial de marcación del empleado
 SELECT * FROM asistencia_empleados WHERE id_empleado =1 and dia='2023-04-01T07:00:00'; --para obtener todo el historial de marcación del empleado segun un día