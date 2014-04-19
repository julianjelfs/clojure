(ns dna)

(defn- neq [[x y]] (not= x y))

(defn hamming-distance [s1 s2]
  (count (filter neq (map vector s1 s2))))

