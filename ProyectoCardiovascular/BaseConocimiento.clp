(deftemplate persona
	(slot codigo
		(type INTEGER)
        	(default -1)
	)
	(multislot nombre
		(type STRING)
		(default "vacio")
		(cardinality 1 2)
	)
	(multislot apellido
		(type STRING)
		(default "vacio")
		(cardinality 1 2)
	)
	(slot peso
		(type FLOAT)
		(default 0.0)
	)
	(slot genero
		(type SYMBOL)
		(default sn)
		(allowed-symbols sn M F)
	)
)