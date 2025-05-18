import io.mcarle.konvert.api.Konverter

@Konverter
interface Mapper {
    fun domainToResource(domain: Domain?): Resource?
    fun resourceToDomain(resource: Resource): Domain
}
