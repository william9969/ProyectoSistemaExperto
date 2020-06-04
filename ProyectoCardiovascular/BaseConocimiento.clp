(defclass persona (is-a USER) 
	(multislot nombre)
	(multislot apellido)
	(slot peso)
	(slot genero)
	(slot cardiovascular)
)

(deftemplate respuestas
	(slot pregunta
		(type INTEGER)
        	(default 0)
	)
	(slot valor
		(type INTEGER)
        	(default 0)
	)
)


(defglobal ?*valorA* = 0)

(defglobal ?*valorB* = 0)

(defglobal ?*valorC* = 0)

(defglobal ?*valorD* = 0)

(defrule respuestaA
	(respuestas (pregunta ?pre) (valor ?val))
	(test (= 1 ?val))
=>	
	(bind ?*valorA* (+ ?*valorA* 1))
	(printout t "Suma" ?*valorA*)
	(printout t "REGLA EJECUTADA")
)

(defrule respuestaB
	(respuestas (pregunta ?pre) (valor ?val))
	(test (= 2 ?val))
=>	
	(bind ?*valorB* (+ ?*valorB* 1))
	(printout t "Suma" ?*valorB*)
)

(defrule respuestaC
	(respuestas (pregunta ?pre) (valor ?val))
	(test (= 3 ?val))
=>	
	(bind ?*valorC* (+ ?*valorC* 1))
	(printout t "Suma" ?*valorC*)
)

(defrule respuestaD
	(respuestas (pregunta ?pre) (valor ?val))
	(test (= 4 ?val))
=>	
	(bind ?*valorD* (+ ?*valorD* 1))
	(printout t "Suma" ?*valorD*)
)

;Funcion para Crear el resultado de cada Valor
(deffunction resultado (?p ?s ?t ?c)
	(open "resultado.txt" archivo "w")
	(printout archivo ?p ";" ?s ";" ?t ";" ?c )
	(close archivo)
	
)

