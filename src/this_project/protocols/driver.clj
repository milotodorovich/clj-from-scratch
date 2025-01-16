(ns this-project.protocols.driver
  (:require
   [this-project.protocols.controller :as routes]
   [this-project.protocols.impl :as f]))

(comment
  ;; pulls together the collaborators and passes them to the
  ;; controller. This could be done somehwere closer to `main`.
  ;; The net result is that `controller-method` does know have
  ;; any knowledge of the internals or dependencies of its
  ;; collaborators.
  (time (routes/controller-method (f/->MockFinder)))
  (time (routes/controller-method (f/->DBFinder {})))

  ;;
  )
