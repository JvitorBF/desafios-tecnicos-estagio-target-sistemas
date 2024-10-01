import json

def calcularFaturamento(dados):
    faturamentos_validos = []
    
    faturamentos_validos = [item['valor'] for item in dados if item['valor'] > 0]
    # Captura o menor valor de faturamento
    menor_faturamento = min(faturamentos_validos)
    # Captura o maior valor de faturamento
    maior_faturamento = max(faturamentos_validos)
    # Calculando a média de faturamento (sem contar dias com valor 0)
    media_mensal = sum(faturamentos_validos) / len(faturamentos_validos)
    # Conta o número de dias em que o faturamento é maior que a média mensal
    dias_acima_da_media =  sum(1 for item in faturamentos_validos if item > media_mensal)
    
    return menor_faturamento, maior_faturamento, dias_acima_da_media

# Abra o arquivo JSON
with open('dados.json', 'r') as arquivo:
    # Carrega o conteúdo do arquivo JSON em um dicionário Python
    dados = json.load(arquivo)

menor_faturamento, maior_faturamento, dias_acima_da_media = calcularFaturamento(dados)

print(f"Menor valor de faturamento: R$ {menor_faturamento:.2f}")
print(f"Maior valor de faturamento: R$ {maior_faturamento:.2f}")
print(f"Número de dias com faturamento acima da média mensal: {dias_acima_da_media}")