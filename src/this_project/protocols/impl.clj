(ns this-project.protocols.impl
  (:require
   [this-project.protocols.controller :refer [Finder]]))

;; Implements a slow version of `Finder`. This could
;; represent a DB or HTTP implementation.
(defrecord DBFinder [_]
  Finder
  (find-product [_ id]
    (println "This is SLOW....")
    (Thread/sleep 1000)
    {:product-id id})
  (find-price [_ product-id]
    (println "This is SLOW....")
    (Thread/sleep 1000)
    {:product-id product-id :price 100}))

;; Implements a fast version of `Finder`. This could
;; be used to make tests fast.
(defrecord MockFinder []
  Finder
  (find-product [_ id]
    (println "This is FAST")
    {:product-id id})
  (find-price [_ product-id]
    (println "This is FAST")
    {:product-id product-id :price 10}))

