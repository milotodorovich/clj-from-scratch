(ns this-project.core
  (:require [clojure.pprint :as pp]))

(defn run [opts]
  (pp/pprint opts)
  (println "Hellow. Welcome to this-project!"))

(comment
  (run nil)
  (run {:one 1}))

