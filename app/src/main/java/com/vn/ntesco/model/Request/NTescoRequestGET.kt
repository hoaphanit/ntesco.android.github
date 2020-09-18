package com.vn.ntesco.model.Request

class NTescoRequestGET : HashMap<String, Any>() {
//    init {
//        put("phone", if (UserUtils.getUserInfo().getPhone() != null) UserUtils.getUserInfo().getPhone() else "")
//    }

    fun setSlug(slug: String) {
        put("slug", slug)
    }

    fun setType(type: String) {
        put("type", type)
    }

    fun setSlugCategory(slug_category: String) {
        put("slug_category", slug_category)
    }

    fun setLan(lan: String) {
        put("lang", lan)
    }

    fun setCategoryId(category_id: Int) {
        put("category_id", category_id)
    }


    fun setYear(year: String) {
        put("year", year)
    }

    fun setStart(start: String) {
        put("start", start)
    }

    fun setEnd(end: String) {
        put("end", end)
    }

    fun setPosition(position: Int) {
        put("position", position)
    }
    fun setPage(page: Int) {
        put("page", page)
    }
    fun setEnv(env: String) {
        put("env", env)
    }
    fun setVersion(version: String) {
        put("version", version)
    }
}