(ns phrase (:require [clojure.string :as str]))

(defn to-seq [p] (str/split p #" "))

(defn normalise [w]
  (str/lower-case (str/replace w #"[,:!&@$%^]" "")))

(defn check-word [m word]
  (if (contains? m word)
    (assoc m word (inc (m word)))
    (assoc m word 1)    ))

(defn countString [m col]
  (if (empty? col)
    m
    (countString (check-word m (first col)) (rest col)) ))

(defn word-count [p]
  (countString {} (remove str/blank? (to-seq (normalise p)))))

