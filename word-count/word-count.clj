(ns phrase (:require [clojure.string :as str]))

(defn- to-seq [p] (str/split p #" "))

(defn- normalise [w]
  (str/lower-case (str/replace w #"[,:!&@$%^]" "")))

(defn word-count [p]
  (frequencies (remove str/blank? (to-seq (normalise p)))))
