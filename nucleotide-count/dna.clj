(ns dna)

(def nucleotides {\A 0, \T 0, \C 0, \G 0})

(defn nucleotide-counts [s]
	(merge nucleotides (frequencies s)))

(defn count [c s]
	(if (contains? (merge nucleotides {\U 0}) c)
    ((nucleotide-counts s) c 0)
    (throw (new Exception (str "invalid nucleotide")))))

