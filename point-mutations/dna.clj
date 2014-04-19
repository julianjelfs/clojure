(ns dna)


(defn- dist [c1 c2] (if (= c1 c2) 0 1))


(defn- count-diffs [v1 v2 c]
  (if (or (empty? v1) (empty? v2))
    c
    (count-diffs (rest v1) (rest v2) (+ c (dist (first v1) (first v2))))))


(defn hamming-distance [s1 s2] (count-diffs (vec s1) (vec s2) 0))
