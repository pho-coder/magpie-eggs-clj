(ns com.jd.bdp.magpie.magpie-eggs-clj.magpie-test-plumber-task.utils)

(defn check-albatross-alive?
  [albatross-id])

(defn check-task-valid?
  [task-id]
  (let [[prefix albatross-id job-id task-id] (clojure.string/split task-id #"*p*")]
    ()))
