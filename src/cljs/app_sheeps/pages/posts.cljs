(ns app-sheeps.pages.posts
    (:require 
     [app-sheeps.articles.article-content :refer [content-store]]
     [app-sheeps.routing]))

(def content-list (get-in content-store [:content]))
(defn posts-page []
    (fn []
        [:span.w-75.flex.flex-column.justify-evenly.overflow-scroll.content-center.items-center.bw2.b--black
            [:h1.w5.tc.avenir "Maybe Posts"
                (for [item content-list]
                    (let [kw (first item)
                          {:keys [title url prev]} (second item)
                            ^{:key kw}
                            [:div.w-100.flex.flex-row.justify-center.ma2
                             [:a.avenir.link.dim.navy.truncate title]]]))]]))
