(ns dna)


(def m {\C \G \G \C \T \A \A \U \U \A})

(defn translate-letter [n] (m n))

(defn to-rna [dna]
  (let [t (apply str (map translate-letter (seq dna)))]
    (assert (= (count dna) (count t)))
    t
    )
  )

(to-rna "XCGFGGTDTTAA")
(to-rna "G")
(count "123")
