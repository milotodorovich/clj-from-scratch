(ns this-project.core
  (:require [clojure.pprint :as pp]))

(defn run [opts]
  (pp/pprint opts)
  (println "Hello. Welcome to this-project!"))

(defn add [a b]
  (+ a b))

(defn multiply [a b]
  (* a b))

(comment
  (run nil)
  (run {:one 1}))

