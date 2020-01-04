(ns app-sheeps.db
  (:require [datascript.core :as d]))

(def default-db
  {:name "re-frame"})


(def schema {:article/title {:db/type :db.type/string}
             :article/content {:db/type :db.type/string}
             :article/tags {:db/cardinality :db.cardinality/many}
             :article/comments {:db/cardinality :db.cardinality/many}})
  
(def conn (d/create-conn schema))