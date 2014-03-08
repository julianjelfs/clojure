(ns dna)


(def m {\C \G \G \C \T \A \A \U \U \A})

(defn translate-letter [n] (if (contains? m n)
  (m n)
  (throw (new AssertionError (str "no")))))

(defn to-rna [dna]
  (apply str (map translate-letter (seq dna))))

