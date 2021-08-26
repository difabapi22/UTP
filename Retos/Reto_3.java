SELECT  Nombre ||" "||Primer_Apellido ||" "||Segundo_Apellido Nombre, Cargo
FROM Lider l
WHERE Ciudad_Residencia = 'Bucaramanga'
ORDER BY Nombre

SELECT Constructora, Banco_Vinculado
FROM Proyecto p
WHERE  Fecha_Inicio BETWEEN '2020-06-01' AND '2020-06-30'
GROUP BY Constructora, Banco_Vinculado
ORDER BY Constructora, Banco_Vinculado

SELECT  Nombre ||" "||Primer_Apellido ||" "||Segundo_Apellido Nombre, COUNT(DISTINCT p.ID_Proyecto) Proyectos
FROM Lider l LEFT JOIN Proyecto p ON l.ID_Lider = p.ID_Lider
WHERE p.Ciudad = 'Pereira'
GROUP BY l.ID_Lider
HAVING Proyectos > 1
ORDER BY Proyectos DESC , Nombre

SELECT mc.Nombre_Material, mc.Precio_Unidad, SUM(c.Cantidad) Total
FROM Proyecto p LEFT JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto LEFT JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion
WHERE p.ID_Proyecto IN (157, 386, 172, 264, 306)
GROUP BY mc.Nombre_Material
ORDER BY mc.Nombre_Material

SELECT Nombre ||" "||Primer_Apellido ||" "||Segundo_Apellido Nombre, SUM(c.Cantidad*mc.Precio_Unidad)/COUNT(DISTINCT p.ID_Proyecto) Promedio
FROM Lider l LEFT JOIN Proyecto p ON l.ID_Lider = p.ID_Lider
	LEFT JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto
	LEFT JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion
WHERE p.Clasificacion = 'Apartaestudio'
GROUP BY l.ID_Lider
HAVING COUNT(DISTINCT p.ID_Proyecto) >= 2
ORDER BY Promedio
LIMIT 3
