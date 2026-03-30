package eu.kanade.tachiyomi.extension.all.nhentai

import kotlinx.serialization.Serializable

@Serializable
class Hentai(
    var id: Int,
    val media_id: String,
    val title: Title,
    val cover: ImageInfo,
    val thumbnail: ImageInfo,
    val scanlator: String = "",
    val upload_date: Long,
    val tags: List<Tag>,
    val num_pages: Int,
    val num_favorites: Long,
    val pages: List<NHPage>,
    val comments: List<Comment> = emptyList(),
    val related: List<Related> = emptyList(),
    val is_favorited: Boolean = false,
)

@Serializable
class Title(
    var english: String? = null,
    val japanese: String? = null,
    val pretty: String? = null,
)

@Serializable
class ImageInfo(
    val path: String,
    val width: Int,
    val height: Int,
)

@Serializable
class NHPage(
    val number: Int,
    val path: String,
    val width: Int,
    val height: Int,
    val thumbnail: String,
    val thumbnail_width: Int,
    val thumbnail_height: Int,
)

@Serializable
class Tag(
    val id: Int,
    val type: String,
    val name: String,
    val slug: String,
    val url: String,
    val count: Int,
)

@Serializable
class Comment(
    val id: Int,
    val gallery_id: Int,
    val poster: Poster,
    val post_date: Long,
    val body: String,
)

@Serializable
class Poster(
    val id: Int,
    val username: String,
    val slug: String,
    val avatar_url: String,
    val is_superuser: Boolean,
    val is_staff: Boolean,
)

@Serializable
class Related(
    val id: Int,
    val media_id: String,
    val thumbnail: String,
    val thumbnail_width: Int,
    val thumbnail_height: Int,
    val english_title: String? = null,
    val japanese_title: String? = null,
    val tag_ids: List<Int> = emptyList(),
)
