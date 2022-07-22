package domain.post.model

import domain.account.model.Account
import org.joda.time.DateTime

case class Post(id: PostId,
                title: String,
                content: String,
                authorName: String,
                createdAt: DateTime,
                updatedOn: DateTime,
                thumbnail: String,
                account: Option[Account] = None)