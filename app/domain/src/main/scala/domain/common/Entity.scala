package domain.common

trait Entity[ID <: Identifier[_]] extends RecordTimestamp {
  val identifier: ID
}
