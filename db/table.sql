CREATE DATABASE db_api_codigos;
CREATE TABLE `cp_mexico` (
  `d_codigo` text,
  `d_asenta` text,
  `d_tipo_asenta` text,
  `D_mnpio` text,
  `d_estado` text,
  `d_ciudad` text,
  `d_CP` text,
  `c_estado` text,
  `c_oficina` text,
  `c_CP` text,
  `c_tipo_asenta` text,
  `c_mnpio` text,
  `id_asenta_cpcons` text,
  `d_zona` text,
  `c_cve_ciudad` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
