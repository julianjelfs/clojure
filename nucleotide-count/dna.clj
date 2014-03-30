(ns dna)

(def nucleotides {\A 0, \T 0, \C 0, \G 0})

(defn nucleotide-counts [s]
	(merge nucleotides (frequencies s)))

(defn count [c s]
	(let [n (nucleotide-counts s)]
		(n c 0)))
